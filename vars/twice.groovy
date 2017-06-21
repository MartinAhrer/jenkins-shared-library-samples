def call(Closure body) {
    node('twice') {
        for (int i=0; i<2; i++) {
            body()
        }
    }
}
