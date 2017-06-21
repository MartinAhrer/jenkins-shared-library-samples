def call(Closure body) {
    for (int i = 0; i < 2; i++) {
        body()
    }
}
