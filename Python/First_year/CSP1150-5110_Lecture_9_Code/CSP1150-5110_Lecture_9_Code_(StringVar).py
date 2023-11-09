# This program demonstrates StringVar objects, defined in tkinter.
# They allow you to create "live variables" -  If the value changes,
# it will be reflected in any widgets linked to it.
# (similar objects exist for other data types, e.g. IntVar)

import tkinter

class ProgramGUI: # define a ProgramGUI class
    def __init__(self):
        self.main = tkinter.Tk()        

        # create a StringVar to store a string
        self.value = tkinter.StringVar()

        # create an Entry widget and set textvariable to the StringVar
        self.txt = tkinter.Entry(self.main, width=15, textvariable=self.value)

        # create a Label widget and set textvariable to the StringVar
        self.lab = tkinter.Label(self.main, textvariable=self.value)

        # pack them both
        self.txt.pack()
        self.lab.pack()

        tkinter.mainloop()

gui = ProgramGUI() # create a ProgramGUI object
