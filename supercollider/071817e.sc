(

{

	var n = 10; 


	var wave = Mix.fill(10,{|i|     

		

    	var mult= ((-1)**i)*(0.5/((i+1)));

    

    	SinOsc.ar(440*(i+1))*mult 

    

    }); 


	Pan2.ar(wave/n,0.0); //stereo, panned centre


}.scope; 

)
