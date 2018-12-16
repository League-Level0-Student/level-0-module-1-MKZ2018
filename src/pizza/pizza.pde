import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch
void setup() {
  size(500,500);
  fill(290,277,220);
  ellipse(200,200,300,300);
  fill(200,0,0);
  ellipse(200,200,260,260);
  fill(290,287,230);
  ellipse(200,200,240,240);
  minim = new Minim(this);
sound = minim.loadFile("rain sound");      
}
void draw() {
  PImage olives = loadImage("sliced olives.jpeg");
  olives.resize(100,100);
  PImage mushroom = loadImage("mushroom.jpeg");
  mushroom.resize(100,100);
  image(mushroom,100,200);
  PImage pepperoni = loadImage("pepperoni.jpeg");
  pepperoni.resize(100,100);
  image(pepperoni, 100,150);
  if(mousePressed) {
 image(olives,mouseX,mouseY);
 sound.play();
 sound.rewind();
  } 
}