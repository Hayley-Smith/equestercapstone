import React, { Component } from 'react';
import './editInfoForm.css';
import { Container } from 'react-bootstrap';
import { Row } from 'react-bootstrap';
import { Col } from 'react-bootstrap';


class EditInfoForm extends Component {
    
    constructor(props) {
        super(props);
        console.log(props);
    }
    
    render() {
        return (
            <Container>
                <Row>
                    <Col>
                        <form>
                            <h1>
                                Edit equine information
                            </h1>
                            <p>
                                Enter your equine's name:
                            </p>
                            <input 
                                type="text"
                            />
                        </form>
                        </Col>
                </Row>
                
            </Container>  
        );
    }
}



    export default EditInfoForm 