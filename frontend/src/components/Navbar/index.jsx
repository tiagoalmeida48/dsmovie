import {ReactComponent as GithubIcon} from 'assets/img/github.svg';

function Navbar() {
  return(
    <header>
    <nav className="container">
      <div className="dsmovie-nav-content">
        <h1>DSMovie</h1>
        <a href="https://github.com/tiagoalmeida48">
          <div className="dsmovie-contact-content">
            <GithubIcon />
            <p className="dsmovie-contact-link">/tiagoalmeida48</p>
          </div>
        </a>
      </div>
    </nav>
  </header> 
  )  
}

export default Navbar