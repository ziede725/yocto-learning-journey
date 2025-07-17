# yocto-learning-journey

#1 Creating layer with bitbake 
bitbake-layers create-layer --example-recipe-name hellorecipe ~/yocto/layers/meta-hello


#2 Adding layer to bblayers.conf 

#Output is in yocto-configs directory 
 
bitbake-layers add-layer ~/yocto/layers/meta-hello

#3 Recipe development : 

Added source file hello.c in files under recipe directory . 
Added do_compile and do_install to the recipe 
Updated the local.conf file to append the recipe to the image with : 
IMAGE_INSTALL:append = " hellorecipe"
run command bitbake hellorecipe 

#4 building core-image-minimal again 

bibtake core-image-minimal 

#5 run on qemu : 

runqemu core-image-minimal nographic 


 
