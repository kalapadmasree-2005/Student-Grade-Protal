import matplotlib.pyplot as plt
import sys

roll = sys.argv[1]
# Sample data
subjects = ['Math', 'Science', 'English']
marks = [85, 78, 92]

plt.bar(subjects, marks, color='purple')
plt.title(f'Result for Roll No: {roll}')
plt.ylabel('Marks')
plt.savefig(f'report_{roll}.png')
print("Chart saved as report_" + roll + ".png")