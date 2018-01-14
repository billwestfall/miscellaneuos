(

var w, carrfreqslider, modfreqslider, modindexslider, synth;


w=Window("frequency modulation via modulation index", Rect(100, 400, 400, 300));

w.view.decorator = FlowLayout(w.view.bounds);


synth= {arg carrfreq=440, modfreq=1, modindex=0; 

SinOsc.ar(carrfreq + (modindex*modfreq*SinOsc.ar(modfreq)),0,0.25)

}.scope;


carrfreqslider= EZSlider(w, 300@50, "carrfreq", ControlSpec(20, 5000, 'exponential', 10, 440), {|ez|  synth.set(\carrfreq, ez.value)});

w.view.decorator.nextLine;


modfreqslider= EZSlider(w, 300@50, "modfreq", ControlSpec(1, 5000, 'exponential', 1, 1), {|ez|  synth.set(\modfreq, ez.value)});

w.view.decorator.nextLine;

modindexslider= EZSlider(w, 300@50, "modindex", ControlSpec(0.0, 10, 'linear', 0.01, 0.0), {|ez|  synth.set(\modindex, ez.value)});


w.front;

)
