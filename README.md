# yocto-learning-journey

#1 Creating layer with bitbake 
bitbake-layers create-layer --example-recipe-name hellorecipe ~/yocto/layers/meta-hello


#2 Adding layer to bblayers.conf 

#Output is in yocto-configs directory 
 
bitbake-layers add-layer ~/yocto/layers/meta-hello 

