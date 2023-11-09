# This program demonstrates using and manipulating an Entry widget.
# The widget's delete(), insert() and select_range() methods are used.

import tkinter

class ProgramGUI: # define a ProgramGUI class
    def __init__(self):        
        self.main = tkinter.Tk()

        self.frm1 = tkinter.Frame(self.main)
        self.txt = tkinter.Entry(self.frm1, width=15)
        self.txt.pack()        
  
        self.frm2 = tkinter.Frame(self.main)
        tkinter.Button(self.frm2, text='Delete', command=self.delete).pack(side='left')
        tkinter.Button(self.frm2, text='Insert', command=self.insert).pack(side='left')
        tkinter.Button(self.frm2, text='Select', command=self.select).pack(side='left')        

        self.frm1.pack()
        self.frm2.pack()        
        tkinter.mainloop()

    def delete(self): # delete all characters
        self.txt.delete(0, tkinter.END)

    def insert(self): # insert "!" at cursor position
        self.txt.insert(tkinter.INSERT, '!')

    def select(self): # select all from insert cursor
        self.txt.select_range(tkinter.INSERT, tkinter.END)
        

gui = ProgramGUI() # create a ProgramGUI object
