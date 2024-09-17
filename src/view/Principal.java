package view;

import controller.ThreadTriatlo;
public class Principal {

	public static void main(String[] args) {
		ThreadTriatlo[] atletas = new ThreadTriatlo[25];
        for (int i = 0; i < 25; i++) {
            atletas[i] = new ThreadTriatlo(i + 1);
            atletas[i].start();
        }
        for (int i = 0; i < 25; i++) {
            try {
                atletas[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
