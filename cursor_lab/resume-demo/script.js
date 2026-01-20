const STORAGE_KEY = 'resume-theme';

function applyTheme(theme) {
  if (theme === 'light') {
    document.documentElement.classList.add('light');
  } else {
    document.documentElement.classList.remove('light');
  }

  const btn = document.querySelector('.theme-toggle-icon');
  if (btn) {
    btn.textContent = theme === 'light' ? '☀️' : '🌙';
  }
}

function getPreferredTheme() {
  const stored = window.localStorage.getItem(STORAGE_KEY);
  if (stored === 'light' || stored === 'dark') return stored;

  if (window.matchMedia && window.matchMedia('(prefers-color-scheme: light)').matches) {
    return 'light';
  }
  return 'dark';
}

function toggleTheme() {
  const current = document.documentElement.classList.contains('light') ? 'light' : 'dark';
  const next = current === 'light' ? 'dark' : 'light';
  window.localStorage.setItem(STORAGE_KEY, next);
  applyTheme(next);
}

document.addEventListener('DOMContentLoaded', () => {
  const theme = getPreferredTheme();
  applyTheme(theme);

  const btn = document.querySelector('.theme-toggle');
  if (btn) {
    btn.addEventListener('click', toggleTheme);
  }
});


