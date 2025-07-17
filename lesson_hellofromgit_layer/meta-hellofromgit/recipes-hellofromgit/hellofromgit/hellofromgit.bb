SUMMARY = "recipe hello from git "
DESCRIPTION = "This recipe will fetch src files from git "
LICENSE = "CLOSED"

SRC_URI = "git://github.com/bhstalel/yocto-hello-c-makefile.git;protocol=git;branch=main" 

SRCREV = "c0b0245eed82bdf16cdefc76bb821917b9996dfb"

S = "${WORKDIR}/git" 
DEPENDS += "libhello"
do_install(){
    install -d ${D}/${bindir}
    install -m 0700 ${B}/hello ${D}/${bindir}
}

