package jilnesta.com.testpaging.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import jilnesta.com.testpaging.data.GithubRepository
import jilnesta.com.testpaging.model.Repo
import jilnesta.com.testpaging.model.RepoSearchResult

class SearchRepositoriesViewModel(private val repository: GithubRepository) : ViewModel() {
    private val queryLiveData = MutableLiveData<String>()
    private val repoResult: LiveData<RepoSearchResult> = Transformations.map(queryLiveData) {
        repository.search(it)
    }

    val repos: LiveData<PagedList<Repo>> = Transformations.switchMap(repoResult) {
        it.data
    }

    val networkErrors: LiveData<String> = Transformations.switchMap(repoResult) {
        it.networkErrors
    }

    /**
     * Search a repository based on a query string.
     */
    fun searchRepo(queryString: String) {
        queryLiveData.postValue(queryString)
    }

    /**
     * Get the last query value.
     */
    fun lastQueryValue(): String? = queryLiveData.value
}