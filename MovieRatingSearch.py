import imdb
moviesDB = imdb.IMDb()

#getting user input
val = input("Enter your movie: ") 

#getting relevant movie objcts
movies = moviesDB.search_movie(val)

print('Searching for ', val, '.....')

#printing relevant movie names and their ratings
for movie in movies:
    title = movie['title']

    id = movie.getID()
    movie_id = moviesDB.get_movie(id)
    year = movie['year']

    rating = movie_id['rating'] 
    print(f'Movie: {title}({year}) -> Rating: {rating}')


    

