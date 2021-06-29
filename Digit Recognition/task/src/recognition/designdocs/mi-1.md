# Design Docs: Milestone-1


## Reasoning
In this milestone (1), I slowly explore the JDK and its standard libraries by building 9 neurons.

The 9 neurons will be mapped onto a 3x3 matrix (or grid) and will be programmed to activate with binary signals, i.e. recognizing either 0 or 1.  In other words, we start out with a right matrix of 9 cells.

The goal is that our 9-neuron network should be able to recognize the *form* of the digit mapped on to the matrix.  However, this task is not easy because in practice, handwritings do not have a constant form.  Every instance of handwriting differs every so slightly (or even wildly) and this introduces interferences into the recognizing task.  Thus, our machine learning program must be able to overcome this difficulty and recognize the digit's *form*.

Such a program always has *input* neurons and *output* neurons.  Except for the input neurons, all other neurons perform mathematical calculations. Suppose we have a set of 3 input neurons (a1, a2, a3), all pointint to one single output neuron (a4).  The compute neuron a4 is responsible for all mathematical calculations, particularly the summing of the all weights of the input neurons:

```tex
a_4 = (a_1 * w_1) + (a_2 * w_2) + (a_3 * w_3)
```

For more details, see visual representations at [original link](https://hyperskill.org/projects/51/stages/277/preview).

In practice, the machine learning algorithm should try to center its output around a value called **bias**.  Thus, we need an additional neuron with weight b to perform this balancing mechanism.


## Description
Write a function that: simulates a neural network with 9 input neurons and 1 output neuron.

This neural network should recognize either 0 or 1 from the 3x3 grid.  In visual representation, the shaded area signals 1 and the empty (or white) area signals 0 to the input neurons.  Again, for more details, refer to the [original content](https://hyperskill.org/projects/51/stages/277/preview)) at Hyperskill.
