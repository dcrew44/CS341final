import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameObjectAdapterImpl extends GameObject implements GameObjectAdapter, KeyListener {
	public Type_B_GameObject typeB;

	public GameObjectAdapterImpl(Type_B_GameObject typeB) {
		super(typeB.getX(), typeB.getY());
		this.typeB = typeB;
		setDirection(typeB.getDirection());
		setVelocity(typeB.getVelocity());
		imageList = typeB.getImageList();
	}

	@Override
	public void setImage() {
		switch (getDirection()) {
		case Direction.NONE:
			break;
		case Direction.UP:
			typeB.currentImage = 0;
			currentImage = 0;
			break;
		case Direction.DOWN:
			typeB.currentImage = 1;
			currentImage = 1;
			break;
		case Direction.LEFT:
			typeB.currentImage = 2;
			currentImage = 2;
			break;
		case Direction.RIGHT:
			typeB.currentImage = 3;
			currentImage = 3;
			break;
		}
	}

	@Override
	public void move(Canvas c) {
		typeB.move(c);
		setX(typeB.getX());
		setY(typeB.getY());
		setDirection(typeB.getDirection());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (highlighted) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				setDirection(Direction.UP);
				typeB.setDirection(Direction.UP);
			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				setDirection(Direction.DOWN);
				typeB.setDirection(Direction.DOWN);
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				setDirection(Direction.LEFT);
				typeB.setDirection(Direction.LEFT);
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				setDirection(Direction.RIGHT);
				typeB.setDirection(Direction.RIGHT);
			}
		}

	}

	public void setHighlight(boolean tf) {
		highlighted = tf;
		typeB.highlighted = tf;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (isHighlighted()) {
			if (e.getKeyCode() != KeyEvent.VK_TAB) {
				typeB.setDirection(Direction.NONE);
				setDirection(Direction.NONE);
			} else {
				setDirection(Direction.RIGHT);
			}
		}
	}

}
