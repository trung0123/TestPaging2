package jilnesta.com.testpaging.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jilnesta.com.testpaging.R

class SearchRepositoriesActivity : AppCompatActivity() {

    private lateinit var viewModel: SearchRepositoriesViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_repositories)
    }
}
