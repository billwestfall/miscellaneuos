// first with a Function. Note the random frequency each time 'play' is called.
f = { SinOsc.ar(200.rand, 0, 0.2) };
x = f.play;
y = f.play;
z = f.play;
x.free; y.free; z.free;
