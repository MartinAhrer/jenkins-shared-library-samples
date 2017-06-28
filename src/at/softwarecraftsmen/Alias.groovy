package at.softwarecraftsmen

// showing that we can run a pipeline step.
def shell(def command) {
    sh "${command}"
}
