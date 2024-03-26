import sys
import os
import re
from collections import defaultdict

if len(sys.argv) < 2:
    print("Need path to directory!")
    exit(1)

path = sys.argv[1]
count = defaultdict(lambda: 0)
for root, dirs, files in os.walk(path):
    for filename in files:
        if filename[-1] == 'c' or filename[-1] == 'h':
            with open(os.path.join(root, filename), "rb") as file:
                lines = file.readlines()
            for line in lines:
                for w in re.sub(rb'[\W_]', b' ', line.strip()).split(b' '):
                    if w: count[w] += 1


def multisort(xs, specs):
    for key, reverse in reversed(specs):
        xs.sort(key=lambda x: x[key], reverse=reverse)
    return xs


count = multisort(list(count.items()), ((1, True), (0, False)))

for k, v in count:
    print(k.decode('utf-8'), v)
