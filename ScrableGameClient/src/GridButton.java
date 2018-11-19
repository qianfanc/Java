import javax.swing.ImageIcon;
import javax.swing.JButton;


public class GridButton extends JButton{
	ImageIcon A;
	ImageIcon B;
	ImageIcon C;
	ImageIcon D;
	ImageIcon E;
	ImageIcon F;
	ImageIcon G;
	ImageIcon H;
	ImageIcon I;
	ImageIcon J;
	ImageIcon K;
	ImageIcon L;
	ImageIcon M;
	ImageIcon N;
	ImageIcon O;
	ImageIcon P;
	ImageIcon Q;
	ImageIcon R;
	ImageIcon S;
	ImageIcon T;
	ImageIcon U;
	ImageIcon V;
	ImageIcon W;
	ImageIcon X;
	ImageIcon Y;
	ImageIcon Z;
	int row;
	int column;
	
	char letter = 0;
	int letterIndex = -1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GridButton() {
		A = new ImageIcon("./image/letter-a.png");
		B = new ImageIcon("./image/letter-b.png");
		C = new ImageIcon("./image/letter-c.png");
		D = new ImageIcon("./image/letter-d.png");
		E = new ImageIcon("./image/letter-e.png");
		F = new ImageIcon("./image/letter-f.png");
		G = new ImageIcon("./image/letter-g.png");
		H = new ImageIcon("./image/letter-h.png");
		I = new ImageIcon("./image/letter-i.png");
		J = new ImageIcon("./image/letter-j.png");
		K = new ImageIcon("./image/letter-k.png");
		L = new ImageIcon("./image/letter-l.png");
		M = new ImageIcon("./image/letter-m.png");
		N = new ImageIcon("./image/letter-n.png");
		O = new ImageIcon("./image/letter-o.png");
		P = new ImageIcon("./image/letter-p.png");
		Q = new ImageIcon("./image/letter-q.png");
		R = new ImageIcon("./image/letter-r.png");
		S = new ImageIcon("./image/letter-s.png");
		T = new ImageIcon("./image/letter-t.png");
		U = new ImageIcon("./image/letter-u.png");
		V = new ImageIcon("./image/letter-v.png");
		W = new ImageIcon("./image/letter-w.png");
		X = new ImageIcon("./image/letter-x.png");
		Y = new ImageIcon("./image/letter-y.png");
		Z = new ImageIcon("./image/letter-z.png");
		
	}
	
	public void setLetter(char letter) {
		this.letter = letter;
		switch(letter) {
		case (char)'a':
			setIcon(A);
			break;
		case (char)'b':
			setIcon(B);
			break;
		case (char)'c':
			setIcon(C);
			break;
		case (char)'d':
			setIcon(D);
			break;
		case (char)'e':
			setIcon(E);
			break;
		case (char)'f':
			setIcon(F);
			break;
		case (char)'g':
			setIcon(G);
			break;
		case (char)'h':
			setIcon(H);
			break;
		case (char)'i':
			setIcon(I);
			break;
		case (char)'j':
			setIcon(J);
			break;
		case (char)'k':
			setIcon(K);
			break;
		case (char)'l':
			setIcon(L);
			break;
		case (char)'m':
			setIcon(M);
			break;
		case (char)'n':
			setIcon(N);
			break;
		case (char)'o':
			setIcon(O);
			break;
		case (char)'p':
			setIcon(P);
			break;
		case (char)'q':
			setIcon(Q);
			break;
		case (char)'r':
			setIcon(R);
			break;
		case (char)'s':
			setIcon(S);
			break;
		case (char)'t':
			setIcon(T);
			break;
		case (char)'u':
			setIcon(U);
			break;
		case (char)'v':
			setIcon(V);
			break;
		case (char)'w':
			setIcon(W);
			break;
		case (char)'x':
			setIcon(X);
			break;
		case (char)'y':
			setIcon(Y);
			break;
		case (char)'z':
			setIcon(Z);
			break;
		default:
			setIcon(null);
			break;
		}
	}
	
	
	public char getLetter() {
		return this.letter;
	}
	
	public boolean hasLetter() {
		return letter == 0;
	}
	
	public void setLetterLocation(int i, int j) {
		row = i;
		column = j;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
}