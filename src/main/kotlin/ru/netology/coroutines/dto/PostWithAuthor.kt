package ru.netology.coroutines.dto

data class PostWithAuthor (
    val post: Post,
    val author : Author,
) {
    override fun toString(): String {
        return "\npost.id=${post.id} author.name=${author.name}"
    }
}
