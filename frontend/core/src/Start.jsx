import React from "react";

class Start extends React.Component {
  constructor(props) {
    super(props);

    this.state = {};
  }

  renderContent = () => {
    const { content } = this.props;

    if (!content) {
      return null;
    }

    return <div style={{ marginBottom: "2px" }}>{content}</div>;
  };

  render() {
    const { buttonText, onStart } = this.props;

    return (
      <>
        {this.renderContent()}
        <button onClick={onStart}>{buttonText}</button>
      </>
    );
  }
}

export default Start;
