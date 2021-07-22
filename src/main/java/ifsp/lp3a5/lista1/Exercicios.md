# Exercícios

1. Para interromper temporariamente a execução de uma thread deve-se
usar `Thread.sleep(timeinMills)`.

2. Uma tarefa, na forma de uma classe, passada a uma thread deve implementar 
   a interface `Runnable`.

3. A ordem de execução de threads pode ser determinada, mas isso depende da 
   implementação da máquina virtual.
   
4. Não é possível determinar a ordem na qual os números serão impressos.

5. Para pegar uma instância da thread que está em execução, deve-se usar
`Thread atual = Thread.currentThread()`.
   
6. O modificador que determina que um recurso deve ser usado por threads de 
   maneira independente é `synchronized`.

7. Uma operação atômica é uma que não pode ser executada pela metade,
   isto é, ou se confirma a execução da operação ou ela deve ser desfeita
   em sua completude.

8. Para se usar o modificador `synchronized` deve se usar:
```java
public void metodo(){
    synchronized(this){
        doSomething();
    }
}
```
Entretanto, no caso de um método (um bloco com nome), o modificador pode ser 
incluído na declaração dele. 

9. Para que a thread A espere a thread B, deve-se colocar um `wait()` 
   na thread A e um `notify()` na thread B.