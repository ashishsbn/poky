SRCBRANCH ?= "master"
PV = "2.34"
SRCREV_glibc ?= "2c16cb88a6e5ace0fb7cedca86860ea7bde522a7"
SRCREV_localedef ?= "95c0221703ad970a52445e9eaf91c4aff35eebef"

GLIBC_GIT_URI ?= "git://sourceware.org/git/glibc.git"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+(\.(?!90)\d+)*)"
