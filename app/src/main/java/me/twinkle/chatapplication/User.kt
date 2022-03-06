package me.twinkle.chatapplication

class User {

    private var name: String? = null
    private var email: String? = null
    private var password: String? = null


    constructor(name: String?, email: String?, password: String?) {
        this.name = name
        this.email = email
        this.password = password
    }

    constructor()
}