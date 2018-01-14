{SinOsc.ar(440,0,0.5)}.scope //bipolar, -0.5 to 0.5


{SinOsc.ar(440,0,0.5,0.5)}.scope //unipolar, 0 to 1 (0.5 plus or minus 0.5)




(

{

var carrier, modulator, carrfreq, modfreq;


carrfreq= MouseX.kr(440,5000,'exponential');

modfreq= MouseY.kr(1,5000,'exponential');


carrier= SinOsc.ar(carrfreq,0,0.5);

modulator= SinOsc.ar(modfreq,0,0.25, 0.25);


carrier*modulator;

}.scope

)
