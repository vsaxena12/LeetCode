using System;



namespace OOPs.Collections.ArrayBaseImplementation
{
	public class CustomArrayList<T>
	{
		private T[] arr;
		private int count;

		public int Count()
		{
			return this.count;
		}

		private const int INITIAL_CAPACITY = 4;

		public CustomArrayList(int capacity = INITIAL_CAPACITY) //initialize the capacity - don't need to initialize the construtor in the driver code
		{
			//capacity = INITIAL_CAPACITY;
			this.arr = new T[capacity];
			this.count = 0;
		}

		public void Add(T item)
		{
			GrowIfArrIsFull();
			this.arr[this.count] = item;
			this.count++;
		}

		public void print()
		{
			Console.WriteLine("We need to buy:");
			for(int i=0; i<Count(); i++)
			{
				Console.WriteLine(" - "+ arr[i]);
			}
		}

		private void GrowIfArrIsFull()
		{
			if (this.count+1 > this.arr.Length)
			{
				T[] extendedArr = new T[this.arr.Length * 2];
				Array.Copy(this.arr, extendedArr, this.count);
				this.arr = extendedArr; //Makes arr refer to same location
			}
		}

		public void Insert(int index, T item)
		{
			if (index > this.count || index < 0)
			{
				throw new IndexOutOfRangeException(
				"Invalid index: " + index);
			}
			GrowIfArrIsFull();
			Array.Copy(this.arr, index,this.arr, index + 1, this.count - index);
			this.arr[index] = item;
			this.count++;
		}

		public void Clear()
		{
			this.arr = new T[INITIAL_CAPACITY];
			this.count = 0;

		}

	}
}




















