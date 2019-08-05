package jilnesta.com.testpaging.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import jilnesta.com.testpaging.R

class SearchRepositoriesActivity : AppCompatActivity() {

    private lateinit var viewModel: SearchRepositoriesViewModel

    private val adapter = ReposAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_repositories)

        // get the view model
        viewModel = ViewModelProviders.of(this).get(SearchRepositoriesViewModel::class.java)
    }
}
