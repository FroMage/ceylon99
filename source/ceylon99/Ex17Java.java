package ceylon99;

interface Callable0<Ret>{
	Ret call();
}

interface Callable1<Ret, Arg1>{
	Ret call(Arg1 arg1);
}

interface Callable0Or1<Ret, Arg1> extends Callable0<Ret>, Callable1<Ret, Arg1>{}

public class Ex17Java {

	private int callMe(){
		return 2;
	}
	
	private int callMe(int i){
		return i;
	}
	
	public void method(){
		workWithMe(new Runnable(){
			@Override
			public void run() {
				callMe();
			}
		});
		workWithMeNoArg(new Callable0<Integer>(){
			@Override
			public Integer call() {
				return callMe();
			}
		});
		Callable0Or1<Integer,Integer> callMe = new Callable0Or1<Integer, Integer>(){
			@Override
			public Integer call() {
				return callMe();
			}
			@Override
			public Integer call(Integer arg1) {
				return callMe(arg1);
			}
		};
		workWithMeNoArg(callMe);
		workWithMeOneArg(callMe, 3);
		
		final int itsDangerousToGoAloneTakeThis = 3;
		int count = 0;
		int otherResult = 0;
		workWithMeNoArg(new Callable0<Void>(){
			@Override
			public Void call() {
				// oops!
//				count++;
//				otherResult += itsDangerousToGoAloneTakeThis;
				// mmmmm
				return null;
			}});
	}
	
	// no type info!
	private void workWithMe(Runnable runnable) {
		runnable.run();
	}

	private <Ret> void workWithMeNoArg(Callable0<Ret> callable) {
		System.out.println(callable.call());
	}

	private <Ret,Arg> void workWithMeOneArg(Callable1<Ret, Arg> callable, Arg a) {
		System.out.println(callable.call(a));
	}

	public static void main(String[] args) {
		new Ex17Java().method();
	}
}
