package ru.netology.coroutines.dto

data class PostWIthAuthorAndComments (
    val post: Post,
    val author : Author,
    val comments: List<CommentWithAuthor>,
) {
    override fun toString(): String {
        return "\npost.id=${post.id} author.name=${author.name} comments=${comments}"
    }
}