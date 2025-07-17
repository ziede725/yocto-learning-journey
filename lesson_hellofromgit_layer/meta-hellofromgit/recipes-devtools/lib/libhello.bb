SUMMARY = "recipe hello from git "
DESCRIPTION = "This recipe will fetch src files from git "
LICENSE = "CLOSED"

SRC_URI = "git://github.com/bhstalel/yocto-hello-c-dependency.git;protocol=git;branch=main" 

SRCREV = "33e4b827e21d93ba34469cda81864d7d903bab98"

S = "${WORKDIR}/git" 

do_install(){
    install -d ${D}/${libdir}
    install -d ${D}/${includedir}
    
    ln -sf libhello.so.1.0 ${D}/${libdir}/libhello.so.1 
    ln -sf libhello.so.1 ${D}/${libdir}/libhello.so   


    install -m 0600 hellolib.h ${D}/${includedir}
    install -m 0700 lib*.so* ${D}/${libdir}
  
}
