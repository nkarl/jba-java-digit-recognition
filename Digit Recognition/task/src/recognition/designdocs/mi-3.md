# Design Doc: MI-3
Note: MI-2 is a extended practice of MI-1, the goal of which is to get introduced to this category of program and algorithms.


## Reasoning
In this milestone, I will truly learn to build a neural network that will learn on its own with without inteference from the user during the learning process.  This means that previously hard-coded information like biases and weights will be removed; the algorithm needs to figure out these values on its own.

Thus, we assert that we do not know what the ideal weights and biases are.  This is the task that the neural network should be able to work out.  It should be able to find them from scratch and then perform the rest of the computation like in the previous stages to arrive at a recoginized digit.

In order to achieve that, we employ the help of the *Sigmoid function*.  This function is called such because of it's S-shaped curve.  That's basically what the descriptor 'Sigmoid' means: Sigma-like, or having the shape of the Greek letter Sigma.  The Sigmoid function is as follow:

```tex
Sigmoid(x) = S(x) = 1 / (1 + e^(-x))
```

In this stage will need to add an extra step of transforming the reduced value to fit in the range 0 to 1.  As we have seen in stage 2/6, each output neuron is scalar resulted from a linear combination of the input matrix and the weighted matrix.  In stage 3/6, we need to reduce this value further and fit it between 0 and 1.  The Sigmoid function is the best function for this task.  Thus, we will integrate this function into the core computation of the output neurons.  

> #### Brief overview of the Sigmoid function:
> ---
> The Sigmoid function is widely popular in statistics.  It is **commonly used as the cumulative distribution function (CDF)** such as the *integrals of the logistic density*, the *normal density*, and *Student's t probability density functions*.
>
> And as noted above, it is also used as the *activation function* in artificial neural networks.

### Delta Rule
The Delta Rule is as folows: for every iteration, find the difference of the current weight between the current iteration and the next iteration.

```tex
\Delta w_(a_i, a_j) = eta * a_i * (a_j^ideal - a_j)

    where:
        - Delta is the difference in weight
        - a_j^ideal is an ideal value
        - eta is the learning rate coefficient (can vay from 0.1 or les to 10 or more)
```

We use `eta=0.5` in this stage.

> #### The Ideal neuron:
> ---
> In this neuron's matrix, all the cells which compose its shape are colored (value 1) and all other cells are empty (value 0).


For complete reference, see original source [@Hyperskill](https://hyperskill.org/projects/51/stages/279/preview).
