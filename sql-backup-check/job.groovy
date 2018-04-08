job('example-job-from-job-dsl') {
    label('secret-data')
    steps {
        shell("echo 'Hello World'")
    }
}
