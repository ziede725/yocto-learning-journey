## 1. Create a Layer with BitBake

```bash
bitbake-layers create-layer --example-recipe-name hellorecipe ~/yocto/layers/meta-hello
```

---

## 2. Add the Layer to `bblayers.conf`

Output is in the `yocto-configs` directory.

```bash
bitbake-layers add-layer ~/yocto/layers/meta-hello
```

---

## 3. Recipe Development

* Added a source file `hello.c` in the `files/` directory under the recipe.
* Added `do_compile` and `do_install` functions to the recipe - [hellorecipe_0.1.bb](./meta-hello/recipes-hellorecipe/hellorecipe/hellorecipe_0.1.bb).
* Updated `local.conf` to include the recipe in the image:

```conf
IMAGE_INSTALL:append = " hellorecipe"
```

* Build the recipe:

```bash
bitbake hellorecipe
```

---

## 4. Build `core-image-minimal` Again

```bash
bitbake core-image-minimal
```

---

## 5. Run the Image on QEMU

```bash
runqemu core-image-minimal nographic
```
