package uz.mirsaidoff.healioss.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.mirsaidoff.healioss.data.Post
import uz.mirsaidoff.healioss.databinding.ItemPostBinding

class PostsAdapter(private val items: MutableList<Post>) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    fun setItems(newItems: List<Post>) {
        this.items.clear()
        this.items.addAll(newItems)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(post: Post) {
            binding.tvTitle.text = post.title
        }
    }
}