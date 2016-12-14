all:
	rm -f multi-image-selector/build/outputs/aar/*
	gradle aR
	cp multi-image-selector/build/outputs/aar/*.aar .

clean:
	gradle clean
