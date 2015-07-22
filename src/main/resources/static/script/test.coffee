@test = ->
  array = [1, 2, 3]
  newArray = (((item) -> item + 1) item for item in array)
  alert newArray
