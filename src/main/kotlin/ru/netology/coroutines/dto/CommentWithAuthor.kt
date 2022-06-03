package ru.netology.coroutines.dto

data class CommentWithAuthor (
    val comment: Comment,
    val author : Author,
) {
    override fun toString(): String {
        return "\n  comment.id=${comment.id} author.name=${author.name}"
    }
}
