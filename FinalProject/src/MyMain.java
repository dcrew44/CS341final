public class MyMain {

	public static void main(String[] args) {

		// TASK 1: CREATE A CANVAS FOR ANIMATION
		Canvas canvas = new Canvas();
		canvas.requestFocus();

		// TASK 2: ADD A USER GAME OBJECT
		Type_D_GameObject user = new Type_D_GameObject(200, 200);
		Type_A_GameObject o2 = new Type_A_GameObject(100, 100);
		Type_C_GameObject o3 = new Type_C_GameObject(100, 200);
		Type_B_GameObject typeB = new Type_B_GameObject(100, 300);
		GameObjectAdapterImpl typeBimpl = new GameObjectAdapterImpl(typeB);
		user.setVelocity(10);
		canvas.addKeyListener(user);
		canvas.addGameObject(user);
		canvas.addKeyListener(o2);
		canvas.addGameObject(o2);
		canvas.addKeyListener(o3);
		canvas.addKeyListener(typeBimpl);
		canvas.addGameObject(typeBimpl);
		canvas.addGameObject(o3);

	}

}
