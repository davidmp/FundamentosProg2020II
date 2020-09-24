def CalcularPromedioNota():

    decision()

    #Datos de Entrada
    N1 = int(input('Ingrese Nota 1: '))
    N2 = int(input('Ingrese Nota 2: '))
    N3 = int(input('Ingrese Nota 3: '))
    N4 = int(input('Ingrese Nota 4: '))
    #Proceso
    PC = (N1+N2+N3+N4)/4
    #Dato de salida
    print(f'El promedio de la calificacion es: {PC}')

def decision():
    print('Hola Bienvenido')
    print()
    print("""
    Menu: Seleccione una opcion
    1. Hacer el calculo,
    2. salir
    """)
    menu = int(input())
    
    if menu == 1:
        CalcularPromedioNota()
    elif menu == 2:
        print('Chau hasta pronto')
    else:
        print('Ingrese una opcion correcta.')
        decision()

decision()