const fizzBuzz = (counter, arr) => {
	if (counter === 0) {
		return '';
	}
	let val = messageBuilder(counter, arr, 0, '');

	if (val === '') {
		return fizzBuzz(counter - 1, arr);
	}

	return fizzBuzz(counter - 1, arr) + counter + ': ' + val + '\n';
}

const messageBuilder = (counter, arr, index, val) => {
	let i = index + 1;
	let message = val;

	if (i > arr.length) {
		return message;
	}
	if (counter%i === 0 && arr[index] !=== undefined) {
		message += arr[index];
	}

	return messageBuilder(counter, arr, i, message)
}

const printValues = [undefined, undefined, "Fizz", undefined, "FizzBuzz", undefined, undefined, undefined, undefined, undefined, undefined, undefined, undefined, undefined, "FizzBuzz"]
console.log(fizzBuzz(100, printValues));