N = int(input())
M = []

for i in range(N):
  M.append(int(input()))

for j in range(N):
  for k in range(N):
    if M[j] < M[k]:
      M[j], M[k] = M[k], M[j]

for l in range(len(M)):
  print(M[l])