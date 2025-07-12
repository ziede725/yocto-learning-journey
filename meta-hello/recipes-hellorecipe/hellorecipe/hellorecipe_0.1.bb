SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "CLOSED"


SRC_URI = "file://hello.c" 

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}
do_compile(){
    ${CC} ${LDFLAGS} ${S}/../hello.c -o hello_bin 
}

do_install(){
    install -d ${D}/usr/bin
    install -m 0744 ${B}/hello_bin ${D}/usr/bin 

}

