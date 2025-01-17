# Base Python image
FROM python:3.9-slim

# Set a working directory in the container
WORKDIR /app

# Copy requirements.txt into the container
COPY requirements.txt .

# Install Python dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy the entire project into the container
COPY . .

# Command to run when the container starts
CMD ["python", "compute_coverage.py"]