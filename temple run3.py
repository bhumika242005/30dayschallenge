import pygame
import random

pygame.init()

# Screen settings
WIDTH = 600
HEIGHT = 700
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Temple Run 3 Lane - Bhumika Intelligent")

clock = pygame.time.Clock()

# Colors
WHITE = (255,255,255)
BLACK = (0,0,0)
RED = (255,0,0)
BLUE = (0,0,255)

# Lane positions
lanes = [150, 300, 450]

# Player settings
player_lane = 1
player_x = lanes[player_lane]
player_y = HEIGHT - 120
player_size = 60

# Obstacles
obstacles = []
obstacle_speed = 8

# Score
score = 0
font = pygame.font.SysFont(None,40)

# Create obstacle
def create_obstacle():
    lane = random.randint(0,2)
    x = lanes[lane]
    y = -80
    obstacles.append([x,y])

# Main game loop
running = True
spawn_timer = 0

while running:

    screen.fill(WHITE)

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        # Move between lanes
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT and player_lane > 0:
                player_lane -= 1
            if event.key == pygame.K_RIGHT and player_lane < 2:
                player_lane += 1

    player_x = lanes[player_lane]

    # Spawn obstacles
    spawn_timer += 1
    if spawn_timer > 40:
        create_obstacle()
        spawn_timer = 0

    # Move obstacles
    for obstacle in obstacles:
        obstacle[1] += obstacle_speed

    # Draw obstacles
    for obstacle in obstacles:
        pygame.draw.rect(screen, RED, (obstacle[0]-30, obstacle[1], 60, 60))

    # Collision detection
    for obstacle in obstacles:
        if abs(obstacle[0]-player_x) < 50 and abs(obstacle[1]-player_y) < 50:
            print("Game Over! Score:", score)
            running = False

    # Remove passed obstacles
    for obstacle in obstacles:
        if obstacle[1] > HEIGHT:
            obstacles.remove(obstacle)
            score += 1

    # Draw player
    pygame.draw.rect(screen, BLUE, (player_x-30, player_y, player_size, player_size))

    # Draw lanes
    pygame.draw.line(screen, BLACK, (200,0), (200,HEIGHT), 3)
    pygame.draw.line(screen, BLACK, (400,0), (400,HEIGHT), 3)

    # Score
    score_text = font.render("Score: "+str(score), True, BLACK)
    screen.blit(score_text, (10,10))

    pygame.display.update()
    clock.tick(60)

pygame.quit()
