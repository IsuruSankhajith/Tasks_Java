# This program re-implements the BMI calculator from Workshop 1 with a GUI.
# It uses Entry widgets to prompt for height and weight,
# and buttons to calculate the BMI or clear the buttons.
# A messagebox is used to show the results or error messages as needed.

import tkinter
import tkinter.messagebox

class BMICalculator:
    def __init__(self):
        self.main = tkinter.Tk()
        self.main.title('BMI Calculator')

        # create Frame widgets
        self.top = tkinter.Frame(self.main, padx=8, pady=4)
        self.middle = tkinter.Frame(self.main)
        self.bottom = tkinter.Frame(self.main, padx=8, pady=4)

        # create and pack height Label and Entry widgets
        self.heightPrompt = tkinter.Label(self.top, width=25, justify='right', text='Enter your height in centimetres: ')
        self.height = tkinter.Entry(self.top, width=6)
        self.heightPrompt.pack(side='left')
        self.height.pack(side='right')

        # create and pack weight Label and Entry widgets        
        self.weightPrompt = tkinter.Label(self.middle, width=25, justify='right', text='Enter your weight in kilograms:')
        self.weight = tkinter.Entry(self.middle, width=6)
        self.weightPrompt.pack(side='left')
        self.weight.pack(side='right')
        
        # create and pack Button widgets
        self.calcButton = tkinter.Button(self.bottom, text='Calculate BMI', command=self.showResult)
        self.resetButton = tkinter.Button(self.bottom, text='Reset Form', command=self.resetForm)
        self.calcButton.pack(side='left')
        self.resetButton.pack(side='left')

        # pack Frame widgets
        self.top.pack()
        self.middle.pack()
        self.bottom.pack()

        # set initial focus on height Entry widget
        self.height.focus_set()
        
        tkinter.mainloop()

    def showResult(self):
        try: # ValueError caused if user didn't type a float
            if float(self.weight.get()) <= 0 or float(self.height.get()) <= 0:
                # raise ValueError if height or weight is <= 0
                raise ValueError
            
            else:
                # calculate and display BMI in a message box
                self.bmi = float(self.weight.get()) / ((float(self.height.get()) / 100) ** 2)
                tkinter.messagebox.showinfo('Results', 'Your BMI is ' + str(round(self.bmi, 1)))
                
        except ValueError: # show error box
            tkinter.messagebox.showerror('Invalid input', 'Enter two positive numbers.')
       

    def resetForm(self): # clear both Entry widgets and set focus on height
        self.weight.delete(0, tkinter.END)
        self.height.delete(0, tkinter.END)
        self.height.focus_set()
        
gui = BMICalculator()
