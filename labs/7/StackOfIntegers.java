
public class StackOfIntegers {
	 private int[] nums;
	    private int am;
	    public StackOfIntegers() {
	        this(16);
	    }
	    public StackOfIntegers(int capacity) {
	        nums = new int[capacity];
	    }
	    public int push(int value) {
	        if (am >= nums.length) {
	            int[] temp = new int[nums.length * 2];
	            System.arraycopy(nums, 0, temp, 0, nums.length);
	            nums = temp;
	        }
	        return nums[am++] = value;
	    }

	    public int pop() {
	        return nums[--am];
	    }

	    public int peek() {
	        return nums[am- 1];
	    }
	    public boolean empty() {
	        return am == 0;
	    }
	    public int getSize() {
	        return am;
	    }
	}

