package jilnesta.com.testpaging.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jilnesta.com.testpaging.R
import jilnesta.com.testpaging.model.Repo

class RepoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(repo: Repo?) {

    }

    companion object {
        fun create(parent: ViewGroup): RepoViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.repo_view_item, parent, false)
            return RepoViewHolder(view)
        }
    }
}