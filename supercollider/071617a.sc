(
 {var trig = Dust.kr(0.01);
	var trig02 = Dust.kr(0.02);
	SinOsc.ar([TRand.kr(30, 100, trig), TRand.kr(30, 100, trig02) ]) * 0.5
 }.play;
);

(
 {var trig03 = Dust.kr(0.002);
	var trig04 = Dust.kr(0.001);
	SinOsc.ar([TRand.kr(30, 100, trig03), TRand.kr(30, 100, trig04) ]) * 0.5
 }.play;
)
