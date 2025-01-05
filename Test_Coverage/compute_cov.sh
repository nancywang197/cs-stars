#!/bin/bash

# Run pytest with coverage options
pytest --cov=functions --cov-report=term-missing --cov-report=html

# Notify user of HTML report location
echo "Coverage report generated: open htmlcov/index.html in your browser to view the detailed report."

# Make executable: chmod +x run_tests.sh
# Run script: compute_cov.sh