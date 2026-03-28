import pygame
import random

# Initialize pygame
pygame.init()

# Screen
width = 800
height = 600
screen = pygame.display.set_mode((width, height))
pygame.display.set_caption("Temple Run - Bhumika Intelligent")

# Colors
white = (255,255,255)
black = (0,0,0)
red = (255,0,0)

# Player
player_size = 50
player_x = width//2
player_y = height-100
player_speed = 8

# Obstacle
obstacle_width = 50
obstacle_height = 50
obstacle_x = random.randint(0,width-50)
obstacle_y = -50
obstacle_speed = 7

# Score
score = 0
font = pygame.font.SysFont(None,40)

clock = pygame.time.Clock()

running = True
while running:

    screen.fill(white)

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    keys = pygame.key.get_pressed()

    if keys[pygame.K_LEFT]:
        player_x -= player_speed

    if keys[pygame.K_RIGHT]:
        player_x += player_speed

    # Move obstacle
    obstacle_y += obstacle_speed

    if obstacle_y > height:
        obstacle_y = -50
        obstacle_x = random.randint(0,width-50)
        score += 1

    # Draw player
    pygame.draw.rect(screen, black, (player_x, player_y, player_size, player_size))

    # Draw obstacle
    pygame.draw.rect(screen, red, (obstacle_x, obstacle_y, obstacle_width, obstacle_height))

    # Collision
    if (player_x < obstacle_x + obstacle_width and
        player_x + player_size > obstacle_x and
        player_y < obstacle_y + obstacle_height and
        player_y + player_size > obstacle_y):

        print("Game Over! Score:", score)
        running = False

    # Score display
    score_text = font.render("Score: " + str(score), True, black)
    screen.blit(score_text, (10,10))

    pygame.display.update()
    clock.tick(60)

pygame.quit()