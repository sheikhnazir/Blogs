# Blogs
Blogs

A blog is a website or section of a website where an individual or organization writes about topics of interest. Blogs are usually maintained by an individual with regular entries of commentary, descriptions of events, or other material such as images.

Consider a web application to maintain these blogs. The flow starts with creating a user on the website. A user can write multiple blogs and update or delete its blogs. Each blog has some title, content and some (possibly multiple) images. The features of an image include its description, dimensions, etc.

The schema of all the models can be found here.

Your task is to complete the driver code for model, controller, service, and repositories related to the Blog, User, and Image. The functionalities for which logic is to be written are:

User:

createUser: create a User with a given username and password. firstName and lastName can be set as “test” by default.
deleteUser: delete a User based on a given id.
updateUser: update the password of given user.
Blog:

createBlog: create a Blog using title, and content and link it to the given user.
deleteBlog: delete a blog based on id.
Image:

addImage: create an image and add it to the given blog.
deleteImage: delete an image.
countImagesInScreen: given an image id and a screen size, find the number of images of given size that can fit completely into the screen with given dimensions. For example, a screen with dimensions 4X4, can completely fit 4 images, each having dimensions 2X2.
Note:

Do not change the name of any existing function/class.
Use findById and deleteById only. Do not use findAll, delete, or find methods.
Avoid using lombok library and its dependency in pom.xml. Create the respective constructors, getters, and setters manually.
