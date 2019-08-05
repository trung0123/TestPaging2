package jilnesta.com.testpaging.data

import android.util.Log
import jilnesta.com.testpaging.model.RepoSearchResult

class GithubRepository {

    fun search(query: String): RepoSearchResult {
        Log.d("GithubRepository", "New query: $query")
    }
}